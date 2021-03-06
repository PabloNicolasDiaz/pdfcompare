/*
 * Copyright 2016 Malte Finsterwalder
 * Copyright [2018] Pablo Nicolas Diaz Bilotto [https://github.com/PabloNicolasDiaz/]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.redsix.pdfcompare;

import static org.apache.commons.lang3.Validate.notNull;

import java.awt.image.BufferedImage;

public class ImageWithDimension {

	public final BufferedImage bufferedImage;
	public final float width;
	public final float height;

	public ImageWithDimension(final BufferedImage bufferedImage, final float width, final float height) {
		notNull(bufferedImage, "bufferedImage was null");
		this.bufferedImage = bufferedImage;
		this.width = width;
		this.height = height;
	}
}
