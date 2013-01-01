package com.bumptech.photos.view.loader;

import com.bumptech.photos.LoadedCallback;
import com.bumptech.photos.PhotoManager;
import com.bumptech.photos.view.assetpath.AssetPathConverter;

/**
 * Created with IntelliJ IDEA.
 * User: sam
 * Date: 12/31/12
 * Time: 4:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class AsIs<T> extends PhotoManagerLoader<T>{
    public AsIs(PhotoManager photoManager, AssetPathConverter<T> assetToPath) {
        super(photoManager, assetToPath);
    }

    @Override
    protected Object doFetchImage(String path, T model, int width, int height, LoadedCallback cb) {
        return photoManager.getImage(path, cb);
    }
}