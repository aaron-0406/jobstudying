import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EstudianteRoutingModule } from './estudiante-routing.module';
import { PerfilComponent } from './pages/perfil/perfil.component';
import { LayoutComponent } from './components/layouts/layout/layout.component';
import { NavbarComponent } from './components/layouts/navbar/navbar.component';
import { FooterComponent } from './components/layouts/footer/footer.component';


@NgModule({
  declarations: [
    PerfilComponent,
    LayoutComponent,
    NavbarComponent,
    FooterComponent
  ],
  imports: [
    CommonModule,
    EstudianteRoutingModule
  ]
})
export class EstudianteModule { }
