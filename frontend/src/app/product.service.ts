import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private api="http://localhost:9090/api/products/search";

  constructor(private http: HttpClient) { }

searchProducts(keyword: string) {
return this.http.get(`${this.api}?keyword=${keyword}`);
}

}
