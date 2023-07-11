package com.example.sping_hibernate.dto.food_request;

import com.example.sping_hibernate.dto.food_request.OrderRequest;
import com.example.sping_hibernate.dto.food_request.SearchCriteria;
import org.springframework.data.domain.Sort;

public class FoodRequestDto {
    private int page;
    private int perPage;
    private SearchCriteria search;
    private OrderRequest order;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public SearchCriteria getSearch() {
        return search;
    }

    public void setSearch(SearchCriteria search) {
        this.search = search;
    }

    public Sort.Order getOrder() {
        return order.toOrder();
    }

    public void setOrder(OrderRequest order) {
        this.order = order;
    }
}
