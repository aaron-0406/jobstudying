import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { EmpleadorComponent } from './components/views/empleador/empleador/empleador.component';
import { OfertaComponent } from './components/views/empleador/oferta/oferta.component';

@NgModule({
  declarations: [AppComponent, EmpleadorComponent, OfertaComponent],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
