import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EstudianteRoutingModule } from './estudiante-routing.module';
import { PerfilComponent } from './pages/perfil/perfil.component';
import { LayoutComponent } from './components/layout/layout.component';


@NgModule({
  declarations: [
    PerfilComponent,
    LayoutComponent
  ],
  imports: [
    CommonModule,
    EstudianteRoutingModule
  ]
})
export class EstudianteModule { }
