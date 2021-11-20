import { Component, Input, OnInit } from '@angular/core';

//services
import { OfertasService } from '../../../../services/ofertas.service';

//models
import { Oferta } from 'src/app/models/Oferta.models';

@Component({
  selector: 'app-empleador',
  templateUrl: './empleador.component.html',
  styleUrls: ['./empleador.component.css'],
})
export class EmpleadorComponent implements OnInit {
  constructor(private ofertasServices: OfertasService) {}

  ofertas: Oferta[] | undefined;

  ngOnInit(): void {
    this.ofertasServices.getOfertas().subscribe((data) => {
      this.ofertas = data;
    });
  }
}
