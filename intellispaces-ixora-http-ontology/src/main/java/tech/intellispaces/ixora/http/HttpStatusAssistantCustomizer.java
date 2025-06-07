package tech.intellispaces.ixora.http;

import tech.intellispaces.commons.exception.UnexpectedExceptions;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(HttpStatusDomain.class)
public interface HttpStatusAssistantCustomizer {

  HttpStatus ok();

  HttpStatus created();

  HttpStatus accepted();

  HttpStatus noContent();

  HttpStatus movedPermanently();

  HttpStatus notModified();

  HttpStatus badRequest();

  HttpStatus unauthorized();

  HttpStatus forbidden();

  HttpStatus notFound();

  HttpStatus notAcceptable();

  HttpStatus internalServerError();

  default HttpStatus get(int code) {
    return switch (code) {
      case HttpStatusCodes.OK -> ok();
      case HttpStatusCodes.CREATED -> created();
      case HttpStatusCodes.ACCEPTED -> accepted();
      case HttpStatusCodes.NO_CONTENT -> noContent();
      case HttpStatusCodes.MOVED_PERMANENTLY -> movedPermanently();
      case HttpStatusCodes.NOT_MODIFIED -> notModified();
      case HttpStatusCodes.BAD_REQUEST -> badRequest();
      case HttpStatusCodes.UNAUTHORIZED -> unauthorized();
      case HttpStatusCodes.FORBIDDEN -> forbidden();
      case HttpStatusCodes.NOT_FOUND -> notFound();
      case HttpStatusCodes.NOT_ACCEPTABLE -> notAcceptable();
      case HttpStatusCodes.INTERNAL_SERVER_ERROR -> internalServerError();
      default -> {
        throw UnexpectedExceptions.withMessage("Unsupported HTTP status code: {}", code);
      }
    };
  }
}
