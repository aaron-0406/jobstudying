import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css'],
})
export class NavbarComponent implements OnInit {
  showList: boolean = true;

  constructor() {}

  ngOnInit(): void {}

  onShowNavbar() {
    this.showList = !this.showList;
  }
}
