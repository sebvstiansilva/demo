import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AutoService {

  endpoint = 'http://localhost:8080/autos';

  constructor( private http: HttpClient ) { }

  async saveAuto(auto : any) {
    const res = this.http.post( `${ this.endpoint }`, auto).toPromise();
    alert('Se agregó el auto.')
    return res
  }

  getAll() {
    return this.http.get( `${ this.endpoint }` );
  }

}
