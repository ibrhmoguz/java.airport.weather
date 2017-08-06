package com.crossover.trial.weather.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class AirportNotFoundHandler implements ExceptionMapper<AirportNotFound> {
	public Response toResponse(AirportNotFound ex) {
		return Response.status(Response.Status.NOT_FOUND).build();
	}
}
