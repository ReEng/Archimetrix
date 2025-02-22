package de.upb.examples.reengineering.store.ui.views;


import java.util.ArrayList;
import java.util.List;

import de.upb.examples.reengineering.store.system.logic.ISearch;
import de.upb.examples.reengineering.store.system.logic.ProductSearch;



public class ProductsListView implements IListView
{

   List<String> products = new ArrayList<String>();


   public ProductsListView()
   {
      products.add("Product 1");
      products.add("Product 2");
   }


   @Override
   public String createListEntry()
   {
      String currentProduct = products.get(0);

      ISearch search = new ProductSearch();
      double price = search.searchPrice(currentProduct);

      String producer = search.searchProducer(currentProduct);

      return currentProduct + ": " + price + " (" + producer + ")";
   }

}
