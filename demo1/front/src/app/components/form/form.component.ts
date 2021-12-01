import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { AutoService } from 'src/app/api/auto.service';
import { Auto } from '../../models/auto.model';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  autos: any = [];
  formAuto: any = {
    marca: "",
    modelo: ""
  }

  constructor(private autoService : AutoService) { }

  ngOnInit(): void {
    this.getAutos();
  }

  getAutos() {
    this.autoService
      .getAll()
      .subscribe( auto => this.autos = auto );
  }

  async onSubmit(){
    await this.autoService.saveAuto(this.formAuto);
    this.getAutos();
  }

}
