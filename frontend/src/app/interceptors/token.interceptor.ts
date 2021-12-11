import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpContext,
  HttpContextToken,
} from '@angular/common/http';
import { Observable } from 'rxjs';

//services
import { TokenService } from '../services/token.service';

const CHECK_TOKEN = new HttpContextToken<boolean>(() => true);
export function checkToken() {
  return new HttpContext().set(CHECK_TOKEN, false);
}

@Injectable()
export class TokenInterceptor implements HttpInterceptor {
  constructor(private tokenService: TokenService) {}

  intercept(
    request: HttpRequest<unknown>,
    next: HttpHandler
  ): Observable<HttpEvent<unknown>> {
    if (request.context.get(CHECK_TOKEN)) {
      console.log(this.tokenService.getToken());
      request = this.addToken(request);
      return next.handle(request);
    }
    return next.handle(request);
  }

  private addToken(request: HttpRequest<unknown>) {
    const token = this.tokenService.getToken();
    console.log(token);
    if (token) {
      const authReq = request.clone({
        headers: request.headers.set('Authorization', `Bearer ${token}`),
      });
      return authReq;
    }
    return request;
  }
}
