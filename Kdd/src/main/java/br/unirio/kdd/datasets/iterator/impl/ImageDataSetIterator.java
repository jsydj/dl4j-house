package br.unirio.kdd.datasets.iterator.impl;

/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

import br.unirio.kdd.datasets.fetchers.ImageDataFetcher;
import org.deeplearning4j.datasets.iterator.BaseDatasetIterator;

public class ImageDataSetIterator extends BaseDatasetIterator {

    /**
     *
     */
    private static final long serialVersionUID = 7295562586439084858L;

    public ImageDataSetIterator(int batch, int numExamples, int imageHeight, int imageWidth) {
        this(batch, numExamples, imageWidth, imageHeight, 3);
    }

    public ImageDataSetIterator(int batch, int numExamples, int imageHeight, int imageWidth, int numChannels) {
        super(batch, numExamples, new ImageDataFetcher(imageWidth, imageHeight, numChannels));
    }

}
