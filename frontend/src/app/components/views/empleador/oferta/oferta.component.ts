import { Component, Input, OnInit } from '@angular/core';

//models
import { Oferta } from 'src/app/models/Oferta.models';

@Component({
  selector: 'app-oferta',
  templateUrl: './oferta.component.html',
  styleUrls: ['./oferta.component.css'],
})
export class OfertaComponent implements OnInit {
  @Input() oferta: Oferta = {
    idOferta: 0,
    nombre: '',
    descripcion: '',
    fechaInicio: new Date(),
    vigencia: 0,
    cantPostulantes: 0,
  };

  constructor() {}

  ngOnInit(): void {}
}
