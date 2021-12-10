import { NgModule } from '@angular/core';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './pages/home/home.component';
import { NavbarComponent } from './components/layouts/navbar/navbar.component';
import { FooterComponent } from './components/layouts/footer/footer.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TokenInterceptor } from './interceptors/token.interceptor';

import { MaterialModule } from './material.module';
import { EstudianteComponent } from './pages/estudiante/estudiante.component';
import { EmpresaComponent } from './pages/empresa/empresa.component';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    FooterComponent,
    LoginComponent,
    RegisterComponent,
    NotFoundComponent,
    EstudianteComponent,
    EmpresaComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MaterialModule,
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: TokenInterceptor, multi: true },
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
