import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-empleador',
  templateUrl: './empleador.component.html',
  styleUrls: ['./empleador.component.css'],
})
export class EmpleadorComponent implements OnInit {
  constructor() {}

  ofertas = [
    'Se busca programador',
    'Se busca administrador',
    'Se busca empleado',
  ];

  ngOnInit(): void {}
}
