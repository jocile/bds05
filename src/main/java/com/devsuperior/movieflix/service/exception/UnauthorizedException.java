package com.devsuperior.movieflix.service.exception;

public class UnauthorizedException extends RuntimeException {
  public UnauthorizedException(String msg) {
    super(msg);
  }
}
