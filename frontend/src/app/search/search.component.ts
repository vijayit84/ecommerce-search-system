import { Component } from '@angular/core';
import { ProductService } from '../product.service';
@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

keyword: string = '';
products: any[] = [];

constructor(private productService: ProductService) { } 
search() {
  this.productService.searchProducts(this.keyword).subscribe((data: any) => {
    this.products = data;
  });
}
}
