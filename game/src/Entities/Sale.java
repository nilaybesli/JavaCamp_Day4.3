package Entities;

import Abstracts.SaleService;

public class Sale implements SaleService{
		private int saleId;

		public Sale() {};
		
		public Sale(int saleId) {
			super();
			this.saleId = saleId;
		}

		public int getSaleId() {
			return saleId;
		}

		public void setSaleId(int saleId) {
			this.saleId = saleId;
		}
		

}