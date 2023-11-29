package com.company.inventory.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryResponseRest extends ResponseRest {

    private final CategoryResponse categoryResponse = new CategoryResponse();

}
