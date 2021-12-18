import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { EstudianteRoutingModule } from './estudiante-routing.module';
import { PerfilComponent } from './pages/perfil/perfil.component';
import { LayoutComponent } from './components/layouts/layout/layout.component';
import { NavbarComponent } from './components/layouts/navbar/navbar.component';
import { FooterComponent } from './components/layouts/footer/footer.component';
import { ModalAcademicoComponent } from './components/views/modal-academico/modal-academico.component';
import { ModalLaboralComponent } from './components/views/modal-laboral/modal-laboral.component';

@NgModule({
  declarations: [
    PerfilComponent,
    LayoutComponent,
    NavbarComponent,
    FooterComponent,
    ModalAcademicoComponent,
    ModalLaboralComponent,
  ],
  imports: [
    CommonModule,
    EstudianteRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
})
export class EstudianteModule {}
