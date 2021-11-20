import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-oferta',
  templateUrl: './oferta.component.html',
  styleUrls: ['./oferta.component.css'],
})
export class OfertaComponent implements OnInit {
  @Input() oferta!: string;

  constructor() {}

  ngOnInit(): void {}
}
