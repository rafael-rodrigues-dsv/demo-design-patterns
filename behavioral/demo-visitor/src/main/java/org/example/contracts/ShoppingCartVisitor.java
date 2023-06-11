package org.example.contracts;

import org.example.model.Book;
import org.example.model.Fruit;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
