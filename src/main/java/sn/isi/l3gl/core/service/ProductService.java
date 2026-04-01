package sn.isi.l3gl.core.service;

import org.springframework.stereotype.Service;
import sn.isi.l3gl.core.entity.Product;
import sn.isi.l3gl.core.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> listProducts() {
        return repository.findAll();
    }

    public Product updateQuantity(Long id, Integer newQuantity) {
        Product p = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit non trouvé : " + id));
        p.setQuantity(newQuantity);
        return repository.save(p);
    }
}