package com.example.RestDemo.controller;

import com.example.RestDemo.Model.CloudVendor;
import com.example.RestDemo.response.ResponseHandler;
import com.example.RestDemo.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    //read cloud vendor details of specific id
@GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return ResponseHandler.responseBuilder
                ("Requested Vendor Details Are Given Here",
                        HttpStatus.OK,
                        cloudVendorService.getCloudVendorService(vendorId));
    }
//Read all cloud vendor details from DB

    @GetMapping("/")
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();
    }
@PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendorService(cloudVendor);
        return "Success";
    }
@PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendorService(cloudVendor);
        return "success";
    }
@DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
    cloudVendorService.deleteCloudVendorService(vendorId);
    return "success";
    }

}

