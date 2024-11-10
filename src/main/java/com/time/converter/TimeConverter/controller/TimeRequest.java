package com.time.converter.TimeConverter.controller;

import java.time.LocalDateTime;

public record TimeRequest(String source, LocalDateTime time, String destination) {
}
