package com.example.learning.Service;

import org.springframework.stereotype.Service;
import com.example.learning.Model.MaterialModel;
import com.example.learning.Repoistory.MaterialRepoistory;

import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepoistory materialRepoistory;

    public MaterialService(MaterialRepoistory materialRepoistory) {
        this.materialRepoistory = materialRepoistory;
    }

    public MaterialModel saveMaterial(MaterialModel materialModel) {
        return materialRepoistory.save(materialModel);
    }

    public List<MaterialModel> getAllMaterials() {
        return materialRepoistory.findAll();
    }

    // You can add more methods for specific material-related operations as needed

}
