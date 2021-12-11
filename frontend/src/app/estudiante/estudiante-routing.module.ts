import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

//pages
import { PerfilComponent } from './pages/perfil/perfil.component';

//components
import { LayoutComponent } from './components/layouts/layout/layout.component';

const routes: Routes = [
  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: '',
        redirectTo: 'perfil',
        pathMatch: 'full',
      },
      {
        path: 'perfil',
        component: PerfilComponent,
      },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class EstudianteRoutingModule {}
