package com.ilyassyaf.mysubmission

object LaptopData {
    private val name = arrayOf(
        "Dell XPS 13 (2019)",
        "Huawei MateBook 13",
        "HP Spectre x360 (2019)",
        "Apple MacBook Pro (15-inch, 2019)",
        "Alienware Area-51m",
        "Google Pixelbook Go",
        "Microsoft Surface Laptop 2",
        "Dell XPS 15 2-in-1",
        "Dell G5 15 5590",
        "Asus Chromebook Flip",
        "HP Spectre Folio",
        "Acer Switch 3",
        "Apple MacBook 12-inch (2017)",
        "Acer Swift 3",
        "Samsung Notebook 9"
    )

    private val description = arrayOf(
        "The Dell XPS 13 has been a regular of our best laptops list for years, and the 2019 model is no exception. It retains everything we've come to love from Dell's flagship 13-incher, from the gorgeous and light design, to the powerful modern components that power it. The Dell XPS 13 rocks an 8th-generation Intel Core i5 or i7 processor and a bezel-less ‘Infinity Edge’ display, this Dell XPS 13 continues to be the most popular Windows laptop in the world.",
        "Huawei has done it again, and its latest laptop is one of our picks for the best laptop of 2019. As with last year's Huawei MateBook X Pro, the MateBook 13 comes with some of the latest components, including a discrete Nvidia MX150 graphics card, and a gorgeous lightweight design, that you'd expect to find on a much more expensive laptop. The fact that the MateBook 13 offer so much, yet comes with an impressively low price – compared to its Ultrabook competitors, like the XPS 13 below – makes it our choice for the best laptop money can buy right now.",
        "The HP Spectre line of Ultrabooks and 2-in-1 laptops has always consisted of extraordinarily attractive devices. So, when we say that the 2019 Spectre x360 takes things to another level, that should mean something. This is one of the most beautiful laptops on the market right now, with its gem cut design and sleek profile. Couple that with the powerful Intel Whiskey Lake processors and long battery life, and you get one of the best laptops on the market right now. Its ability to flip into a Windows tablet is just icing on the cake.",
        "This year's model of the 15-inch Apple MacBook Pro is the most powerful MacBook the Cupertino company has ever made. By fitting some of the most powerful components in the world (including 6- and 8-core Intel processors) into the iconic slimline MacBook body, Apple has created a formidable professional laptop that earns its place on our best laptops list",
        "The Alienware Area-51m is our pick for the best gaming laptop of 2019, so naturally, it also deserves a place in our list of the best laptops money can buy. With an eye catching design and brilliant build quality, which we've come to expect from Dell's Alienware brand, this is an incredible performer, offering a choice of some of the very best gaming components on the market right now, including a choice of 9th generation Intel Core processors, and Nvidia's latest RTX range of GPUs.",
        "Google's new Pixelbook Go is the best Chromebook money can buy right now, with the company showing everyone else how it's done. Its previous Chromebook, the Pixelbook, was a brilliant Chromebook in its own way, but it cost a small fortune.",
        "Microsoft's second attempt at a pure laptop device is an absolute winner in our view, and while it doesn't represent a huge overhaul of the original Surface Laptop, it offers improvements in all the areas we were hoping for, including updated hardware that brings serious performance benefits. This is a laptop that finally delivers on what Microsoft set out to do with the original: a pure, powerful Windows 10 laptop experience.",
        "Last year’s Dell XPS 15 was already one of the best laptops you could buy, but now that Dell has taken the beautiful redesign of the Dell XPS 13 and applied it here – while also making it a convertible. Well, it’s amazing. Not only do you get one of the most aesthetically pleasing 15-inch laptops on the market, but it also packs one of those new Intel  Kaby Lake G-series CPUs featuring ‘discrete-class’ Radeon graphics.",
        "While the Alienware Area-51m (featured earlier in this best laptops list) is the best gaming laptop for people with a lot of money to spare, if you're on a tighter budget, then the Dell G5 15 5590 gaming laptop is a fantastic choice. Dell’s 15-inch G5 doesn't have the highest end specs, but it will see you through 1080p gaming and last you up to 10 hours of battery life as well – which is pretty remarkable for a gaming laptop.",
        "When it comes to the best Chromebook laptop, you have a choice between two stark alternatives. There's the more expensive Chromebook Pixel Go (featured earlier in this list), and then there's the excellent Asus Chromebook Flip C302, which combines premium features in a much more affordable package.",
        "The new Asus VivoBook S15 hasn't been out for long, and it's made its way straight into our best laptops list. This is because it combines a thin and light design with great performance and an excellent price. If you're looking for a mid-range laptop that doesn't cost too much, but still performs brilliantly, then this is the best laptop for you. Thanks to its powerful Intel processor, 8GB of RAM and fast SSD storage, this is a laptop that can handle almost any task with ease – though gaming is out of the question.",
        "If you want the Microsoft Surface Book 2 but you want to spend a lot less, the Acer Switch 3 2017 is definitely the your best option. As usual it comes in several different versions, with USB Type-C, 8GB RAM, an IPS display and Intel Core i3 7100U CPU coming with the more expensive option.",
        "The MacBook is another win for Apple, and it's once again won us over with a gorgeous design, excellent performance and best-in-class battery life. Apple has updated the processors with Intel's 7th-generation Kaby Lake range, which means you get improved performance and longer battery life without sacrificing the thin and light design that the MacBook is famous for.",
        "When HP unveiled the HP Spectre Folio, it made some big claims about how the 2-in-1 laptop would reinvent the PC. While it doesn't quite match the hype, what we do have is one of the most beautifully-designed laptops we've ever tried. Billed as \"modern vintage meets technology\", the HP Spectre Folio is built directly into a piece of genuine leather.",
        "While it may not have the best keyboard in the world, the Samsung Notebook 9 was one of the best laptops you could buy in 2018. and that stands in 2019. Packed with more horsepower than the MacBook Pro, but at a much lower price, Samsung has crafted a laptop that has just as much substance as it does style."
    )

    private val storage = arrayOf(
        "256GB – 1TB SSD",
        "256GB - 512GB SSD",
        "256GB – 2TB PCIe SSD",
        "256GB – 4TB SSD",
        "1TB SSHD – 2TB RAID0 SSDs + 1TB SSHD",
        "128GB - 256GB eMMC",
        "128GB, 256GB, 512GB or 1TB SSD",
        "512GB PCIe SSD",
        "128GB SSD + 1TB HDD – 1TB SSD",
        "32GB – 64GB eMMC",
        "256GB SSD",
        "64GB - 128GB eMMC",
        "256GB – 512GB SSD",
        "128GB – 256GB SSD",
        "256-512GB SSD"
    )

    private val screen = arrayOf(
        "13.3-inch FHD (1,920 x 1,080) – 4k (3840 x 2160)",
        "13-inch 1440p (2,160 x 1,440)",
        "13.3-inch full HD (1,920 x 1,080) – UHD (3,840 x 2,160) touchscreen",
        "15.4-inch, (2,880 x 1,800) IPS",
        "17.3-inch FHD (1920 x 1080) 60Hz Anti-Glare IPS – 144Hz IPS NVIDIA G-SYNC",
        "13.3-inch Full HD (1,920 x 1,080) or 4K LCD touchscreen",
        "13.5-inch PixelSense (2,256 x 1,504)",
        "13.3-inch UHD (3,840 x 2,160) touchscreen",
        "15.6 inch FHD (1920 x 1080) IPS 300-nits – 15.6 inch FHD(1920 x 1080) 300nits IPS Anti-Glare LED with 144Hz refresh rate",
        "12.5-inch, FHD (1,920 x 1,080) LED backlit anti-glare",
        "13.3-inch (1,920 x 1,080)",
        "12.2-inch, 1920 x 1200 IPS LCD touchscreen",
        "12-inch, (2,304 x 1,440) IPS 16:10",
        "14-inch full HD (1920 x 1080) ComfyView IPS",
        "15-inch 1,920 x 1,080 LED"
    )

    private val ram = arrayOf(
        "8GB – 16GB DDR4",
        "8GB DDR4",
        "8GB – 16GB DDR4",
        "16GB DDR4",
        "16GB – 64GB DDR4",
        "8GB - 16GB DDR4",
        "8GB - 16GB DDR4",
        "8GB DDR4",
        "8GB – 16GB DDR4",
        "4GB DDR4",
        "8GB – 16GB DDR4",
        "4GB DDR4",
        "8GB – 16GB DDR4",
        "4GB – 8GB DDR4",
        "8GB-16GB DDR4"
    )

    private val cpu = arrayOf(
        "8th generation Intel Core i5 – i7",
        "8th generation Intel Core i5 – i7",
        "Intel Core i5 – i7",
        "Intel Core i7 – i9",
        "Intel Core i7-9700 – i9-9900K",
        "Intel Core m3 - Intel Core i7",
        "Intel Core i5 - i7",
        "Intel Core i5-i7",
        "Intel Core i7-9750H",
        "Intel Pentium 4405Y – Intel Core m3-6Y30",
        "Intel Core i5-8200Y - Intel Core i7-8500Y",
        "Intel Pentium Quad Core N4200 - Intel Core i3 7100U",
        "Intel Core M3 1.2GHz - Intel Core i7 1.4GHz",
        "Dual-core Intel Core i3 – i7",
        "Intel i7-8550U"
    )

    private val graphics = arrayOf(
        "Intel UHD Graphics 620",
        "Intel UHD Graphics 620 , Nvidia GeForce MX150 2GB GDDR5",
        "Intel UHD Graphics 620 | RAM: 8GB – 16GB",
        "AMD Radeon Pro 555X - Radeon Pro Vega 20, Intel UHD Graphics 630",
        "NVIDIA GeForce RTX 2060 – 2080",
        "Intel UHD Graphics 615",
        "Intel UHD Graphics 620",
        "Radeon RX Vega M GL Graphics with 4GB HMB2 Graphics Memory",
        "Nvidia GeForce RTX 2070 with Max-Q",
        "Intel HD Graphics 515",
        "Intel UHD Graphics 615",
        "Intel HD Graphics 505",
        "Intel HD Graphics 615",
        "Intel HD Graphics 620",
        "Nvidia GeForce MX150"
    )

    private var photo = arrayOf(
        R.drawable.dell_xps_13,
        R.drawable.huawei_mattebook_13,
        R.drawable.hp_spectre_x360_2019,
        R.drawable.macbook_pro_2019,
        R.drawable.alienware_area51m,
        R.drawable.google_pixelbook_go,
        R.drawable.microsoft_surface_2,
        R.drawable.dell_xps_15_2in1,
        R.drawable.dell_g5_15_5590,
        R.drawable.asus_chromebook_flip,
        R.drawable.hp_spectre_folio,
        R.drawable.acer_switch_3,
        R.drawable.apple_macbook_2017,
        R.drawable.acer_swift_3,
        R.drawable.samsung_notebook_9
    )

    private val price = arrayOf(
        "$1,129.99",
        "$936.26",
        "$???.??",
        "$2,199.99",
        "$2,644.00",
        "$???.??",
        "$999.00",
        "$2,298.90",
        "$1,060.87",
        "$575.00",
        "$599.00",
        "$???.??",
        "$1,249.00",
        "$1,023.00",
        "$2,099.00"
    )

    fun getImage(i: Int): Int {
        return photo[i]
    }

    val listData: ArrayList<Laptop>
        get() {
            val list = arrayListOf<Laptop>()
            for(position in name.indices){
                val laptop = Laptop()
                laptop.name = name[position]
                laptop.cpu = cpu[position]
                laptop.graphics = graphics[position]
                laptop.ram = ram[position]
                laptop.screen = screen[position]
                laptop.storage = storage[position]
                laptop.photo = photo[position]
                laptop.description = description[position]
                laptop.price = price[position]
                list.add(laptop)
            }
            return list
        }
}
