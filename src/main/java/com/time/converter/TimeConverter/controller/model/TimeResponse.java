package com.time.converter.TimeConverter.controller.model;

import java.time.ZonedDateTime;

public record TimeResponse(
		ZonedDateTime time,
		Whether weather
) {
}
