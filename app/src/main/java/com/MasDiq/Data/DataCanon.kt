package com.MasDiq.Data

import com.MasDiq.ProjectStarter.R

object DataCanon {
    private val imageId = arrayListOf(
        R.drawable.eos_850d,
        R.drawable.eos_1d_x_mark_iii,
        R.drawable.eos_90d,
        R.drawable.powershot_g7_x_mark_iii,
        R.drawable.powershot_g5_x_mark_iii,
        R.drawable.eos_r6,
        R.drawable.eos_r5,
        R.drawable.eos_rp,
        R.drawable.eos_r,
    )

    private val title = arrayListOf(
        "Canon EOS 850D",
        "Canon EOS 1DX III",
        "Canon EOS 90D",
        "PowerShot G5X II",
        "PowerShot G7X III",
        "Canon EOS R6",
        "Canon EOS R5",
        "Canon EOS RP",
        "Canon EOS R",
    )

    private val subtitle = arrayListOf(
        "Get Your Photography Game On",
        "The EXCEPTIONAL Game Changer",
        "Prodigy Mid-Range DSLR",
        "Miniature Camera for Pro",
        "For Your Everyday Photography",
        "Born to Rule Mirrorless Camera",
        "Born to Dominate Mirrorless Camera",
        "Reimagine Your Potential",
        "Reimagine Optical Excellence",
    )

    private val price = arrayListOf(
        "Rp.15,900,000",
        "Rp.122,900,000",
        "Rp.20,900,000",
        "Rp.14,240,000",
        "Rp.11,259,000",
        "Rp.47,880,000",
        "Rp.72,500,000",
        "Rp.19,900,000",
        "Rp.30,750,000",
    )

    private val desc = arrayListOf(
        "Packed with sophisticated features like higher-end models and yet easy to use, the EOS 850D is a reasonably-priced DSLR that delivers the quality you need. Perfect for those serious on picking up photography, this is the simple and affordable choice as your stepping stone towards mastery in photography.",
        "Notably distinguished as the epitome of full-frame DSLR cameras for professionals, the Canon EOS-1D series creates a brand new masterpiece in their finest, class-leading flagship to date. A sturdy and reliable workhorse crafted to perfection for swift response, and intuitive focusing the Canon EOS-1D X Mark III offers superior image quality as well as breathtaking 4K video recording made for the most challenging subjects.",
        "Designed for those looking to hone their craft further, EOS 90D have 45 cross-type AF points in its 100% coverage optical viewfinder and can shoot up to 10fps even in tracking--capturing those deciding moments whether for sports or wildlife photography. The 5,481 selectable focus positions and Eye Detection AF provides more creative freedom in composition while using Live View, ensuring every image is tack sharp.",
        "The 4th generation model of Canon’s best-selling full-frame EOS camera EOS 5D Mark IV comes equipped with 30.4-megapixel full-frame CMOS sensor and highly sought-after Dual Pixel CMOS AF. High-speed, high-precision AF is realized not only for stills, but also for 4K movie shooting, making pro-level footage a possibility. Canon Log is also made available for users who are looking to shoot serious video footage. With this firmware upgrade, the dynamic range increases up to 800 percent, providing approximately 12 stops of dynamic range, even in low light.",
        "Posed as the lightest DSLR in the EOS full-frame DSLR line-up, the EOS 6D Mark II, a powerful yet compact full-frame DSLR camera promises to propel your images to the next level. Its 26.2-megapixel image sensor, Dual Pixel CMOS AF, and a Vari-angle touch panel LCD monitor empowers you with the ability to take stunning images and videos, with fast, touchscreen-operable AF and from different angles. Movie digital IS, a 5-axis image stabilization system, is built within the camera for suppressing camera shake when shooting handheld movies — a useful feature especially when recording in quality as high as Full HD 60p / 50p.",
        "Conquer the darkness with the EOS R6. This full-frame mirrorless camera based on the revolutionary RF mount comes with powerful In-Body Image Stabilization up to 8 stops, ISO range up to 102400 and low luminance AF sensitivity of up to EV -6.5 – all designed to give you optimum performance for low-light photography.",
        "Make way for the new king. The EOS R5 is here with groundbreaking 8K resolution video recording, included for the first time ever in a Canon camera. With all-new Animal Detection AF and powerful In-Body Image Stabilization that goes up to 8 stops for edge-to-edge high quality images and video made possible by the RF mount, experience the best of Canon's full-frame mirrorless series with this flagship model -- the EOS R5.",
        "Being Canon’s lightest Full-Frame Mirrorless Interchangeable Lens Camera with EVF, EOS RP has a 26.2-megapixels CMOS sensor and shoot 4K UHD videos*. Dual Sensing IS made possible with RF mount technology and DIGIC 8 processor, providing up to five stops of shutter speed for still images. Fleeting moments caught with 0.05secs AF time, low-light focus limit of EV -5, Eye Detection AF (Servo AF) and 4,779 selectable AF positions, powered by the Dual Pixel CMOS AF technology.",
        "Launched as Canon’s First Full-Frame Mirrorless Interchangeable Lens Camera with built in EVF, the EOS R features the breakthrough in mount technology for high-speed communication between lens and camera. The DIGIC 8 processor not only enables the camera to support new features such as in-camera Digital Lens Optimiser, but also enhances Dual Sensing IS and Combination IS, which provide up to 5 stops image stabilisation for 30.3-megapixel stills and 4K UHD videos. Never miss a shot again with near instantaneous of 0.05secs AF, near complete darkness focus limit of EV -6, Eye Detection AF and 5,655 selectable AF positions, made possible with Dual Pixel CMOS AF technology.",
    )

    val listCameraCanon: ArrayList<Data>
        get() {
            val list = arrayListOf<Data>()
            for (x in title.indices) {
                val data = Data()
                data.image = imageId[x]
                data.title = title[x]
                data.subtitle = subtitle[x]
                data.price = price[x]
                data.desc = desc[x]
                list.add(data)
            }
            return list
        }
}