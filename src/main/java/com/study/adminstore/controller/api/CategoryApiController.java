package com.study.adminstore.controller.api;

import com.study.adminstore.ifs.CrudInterface;
import com.study.adminstore.model.entity.Category;
import com.study.adminstore.model.network.request.CategoryApiRequest;
import com.study.adminstore.model.network.response.CategoryApiResponse;
import com.study.adminstore.service.CategoryApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryApiController implements CrudInterface<CategoryApiRequest, CategoryApiResponse> {
    @Autowired
    private CategoryApiService categoryApiService;

    @Override
    @PostMapping("")
    public ResponseEntity<CategoryApiResponse> create(@RequestBody final CategoryApiRequest req) {
        return categoryApiService.create(req);
    }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<CategoryApiResponse> read(@PathVariable final Long id) {
        System.out.println("id" + id);
        return categoryApiService.read(id);
    }

    @Override
    @PutMapping("")
    public ResponseEntity<CategoryApiResponse> update(@RequestBody final CategoryApiRequest req) {
        return categoryApiService.update(req);
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<CategoryApiResponse> delete(@PathVariable final Long id) {
        return categoryApiService.delete(id);
    }

    @GetMapping("/findAll")
    public List<Category> findAll() {
//        if(pageable == null) pageable = 5;
        return categoryApiService.findAll();
    }
}
