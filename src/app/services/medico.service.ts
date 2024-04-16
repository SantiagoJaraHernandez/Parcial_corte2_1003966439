import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MedicoService {

  apiUrl = environment.apiUrl;

  constructor(private http: HttpClient) { }

  getAllMedicos() {
    return this.http.get<any[]>(`${this.apiUrl}/medicos`);
  }

  // Otros métodos para interactuar con el backend
}
