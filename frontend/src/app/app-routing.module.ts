import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

//Pages
import { NotFoundComponent } from './website/pages/not-found/not-found.component';

const routes: Routes = [
  {
    path: '',
    loadChildren: () =>
      import('./website/website.module').then((m) => m.WebsiteModule),
  },
  {
    path: 'estudiante',
    loadChildren: () =>
      import('./estudiante/estudiante.module').then((m) => m.EstudianteModule),
  },
  {
    path: 'empresa',
    loadChildren: () =>
      import('./empresa/empresa.module').then((aaron) => aaron.EmpresaModule),
  },
  {
    path: '**',
    component: NotFoundComponent,
  },
  //Definir demás rutas
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
