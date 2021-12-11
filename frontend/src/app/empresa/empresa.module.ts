import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EmpresaRoutingModule } from './empresa-routing.module';
import { PerfilComponent } from './pages/perfil/perfil.component';
import { NavbarComponent } from './components/layouts/navbar/navbar.component';
import { LayoutComponent } from './components/layouts/layout/layout.component';
import { FooterComponent } from './components/layouts/footer/footer.component';


@NgModule({
  declarations: [
    PerfilComponent,
    NavbarComponent,
    LayoutComponent,
    FooterComponent
  ],
  imports: [
    CommonModule,
    EmpresaRoutingModule
  ]
})
export class EmpresaModule { }
