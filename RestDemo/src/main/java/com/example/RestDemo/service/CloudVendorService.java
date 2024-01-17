package com.example.RestDemo.service;

import com.example.RestDemo.Model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendorService(CloudVendor cloudVendor);
    public String updateCloudVendorService(CloudVendor cloudVendor);
    public String deleteCloudVendorService(String cloudVendorId);
    public CloudVendor getCloudVendorService(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
