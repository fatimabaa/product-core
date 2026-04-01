package sn.isi.l3gl.core.service;

import org.springframework.stereotype.Service;
import sn.isi.l3gl.core.entity.Product;
import sn.isi.l3gl.core.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }
}