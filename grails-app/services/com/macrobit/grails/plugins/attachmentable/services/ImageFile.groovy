package com.macrobit.grails.plugins.attachmentable.services
import java.awt.image.BufferedImage
import javax.imageio.ImageIO

class ImageFile {
	Long size
	String name
	String originalFilename
	String contentType = "image/jpeg"
	BufferedImage imageData
	
	
	ImageFile(BufferedImage imageData, def imgLen, def imageName, def oFileName) {
		this.imageData = imageData
		size = imgLen
		name = imageName
		originalFilename = oFileName
	}
	
	def transferTo(File imageFile) {
		println "transferTo called"
		ImageIO.write(imageData, "jpeg", imageFile);
		return imageFile
	}
}
