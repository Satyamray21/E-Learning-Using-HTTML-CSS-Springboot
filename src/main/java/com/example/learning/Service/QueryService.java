package com.example.learning.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.learning.Model.QueryModel;
import com.example.learning.Repoistory.QueryRepoistory;

@Service
public class QueryService {
    private final QueryRepoistory queryRepoistory;

    public QueryService(QueryRepoistory queryRepoistory) {
        this.queryRepoistory = queryRepoistory;
    }
    public QueryModel saveQuery(QueryModel queryModel) {
        return queryRepoistory.save(queryModel);
    }

    public List<QueryModel> getAllQueries(){
        return queryRepoistory.findAll();
    }
    public List<QueryModel> getSolvedQueries(){
        return queryRepoistory.findBySolved(true);
    }
    public List<QueryModel> getUnSolvedQueries(){
        return queryRepoistory.findBySolved(false);
    }
   
}
    
    


    

