import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { WebsiteRoutingModule } from './website-routing.module';
import { LayoutComponent } from './components/layouts/layout/layout.component';
import { NavbarComponent } from './components/layouts/navbar/navbar.component';
import { FooterComponent } from './components/layouts/footer/footer.component';

@NgModule({
  declarations: [LayoutComponent, NavbarComponent, FooterComponent],
  imports: [CommonModule, WebsiteRoutingModule],
})
export class WebsiteModule {}
