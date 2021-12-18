import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

import { EstudianteRoutingModule } from './estudiante-routing.module';
import { PerfilComponent } from './pages/perfil/perfil.component';
import { LayoutComponent } from './components/layouts/layout/layout.component';
import { NavbarComponent } from './components/layouts/navbar/navbar.component';
import { FooterComponent } from './components/layouts/footer/footer.component';
import { ModalAcademicoComponent } from './components/views/modal-academico/modal-academico.component';

@NgModule({
  declarations: [
    PerfilComponent,
    LayoutComponent,
    NavbarComponent,
    FooterComponent,
    ModalAcademicoComponent,
  ],
  imports: [CommonModule, EstudianteRoutingModule, FormsModule],
})
export class EstudianteModule {}
