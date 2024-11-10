package com.time.converter.TimeConverter.controller;

import com.time.converter.TimeConverter.controller.model.TimeResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class TimeController {
	@PostMapping("/v1/convert")
	public TimeResponse getConvert(@RequestBody TimeRequest request){
		ZonedDateTime time = ZonedDateTime.of(request.time(), ZoneId.of(request.source()));
		return new TimeResponse(time.withZoneSameInstant(ZoneId.of(request.destination())),null);
	}
}
