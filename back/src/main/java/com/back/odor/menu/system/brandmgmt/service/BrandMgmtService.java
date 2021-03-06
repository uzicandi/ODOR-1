package com.back.odor.menu.system.brandmgmt.service;

import com.back.odor.menu.system.brandmgmt.mapper.BrandMgmtMapper;
import com.back.odor.menu.system.brandmgmt.vo.BrandCategoryMapperVO;
import com.back.odor.menu.system.brandmgmt.vo.BrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandMgmtService implements BrandMgmtServiceSpec {

    @Autowired
    private BrandMgmtMapper brandMgmtMapper;

    @Override
    public List<BrandVO> getBrandList(BrandVO vo) {
        return brandMgmtMapper.getBrandList(vo);
    }

    @Override
    public List<BrandVO> getBrandListAll() {
        return brandMgmtMapper.getBrandListAll();
    }

    @Override
    public Integer checkDuplication(BrandVO vo) {
        return brandMgmtMapper.checkDuplication(vo);
    }

    @Override
    public void insertBrand(BrandVO vo) {
        brandMgmtMapper.insertBrand(vo);
    }

    @Override
    public void updateBrand(BrandVO vo) {
        brandMgmtMapper.updateBrand(vo);
    }

    @Override
    public void deleteBrand(BrandVO vo) {
        brandMgmtMapper.deleteBrand(vo);
    }

    @Override
    public List<BrandCategoryMapperVO> getMappedCategoryList(Long brandKey) {
        return brandMgmtMapper.getMappedCategoryList(brandKey);
    }

    @Override
    public void deleteMapping(Long brandKey) {
        brandMgmtMapper.deleteMapping(brandKey);
    }

    @Override
    @Transactional
    public void saveMapping(List<BrandCategoryMapperVO> list) {
        brandMgmtMapper.deleteMapping(list.get(0).getBrandKey());

        for (BrandCategoryMapperVO vo : list) {
            brandMgmtMapper.insertMapping(vo);
        }
    }

}
