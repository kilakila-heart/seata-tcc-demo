package pers.kerry.seata.demo.storageservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.kerry.seata.demo.storageservice.service.StorageService;

import java.util.Random;

/**
 * @description:
 * @date: 2021/2/14 11:13 上午
 * @author: kerry
 */
@RestController
@RequestMapping("storage")
public class StorageController {
    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/decrease-storage")
    public String decreaseStorage(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decreaseStorage(productId, count);
        Random rand = new Random();
        boolean result = rand.nextBoolean();
        if (result) {
            System.out.println(1 / 0);
        }
        return "减少商品库存成功！";
    }
}
