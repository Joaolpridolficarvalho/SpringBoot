package com.example.OpportunitiesApi.Service;

import com.example.OpportunitiesApi.Model.Opportunity;
import com.example.OpportunitiesApi.Model.Url;
import com.example.OpportunitiesApi.Model.User;

public interface IUrlManager {
    Url getUrl(Opportunity opportunity, User user);
    void deleteUrl(Url url);


}
