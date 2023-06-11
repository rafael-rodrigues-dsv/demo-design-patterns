package org.example.contracts;

import org.example.models.Book;
import org.example.models.Fruit;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
