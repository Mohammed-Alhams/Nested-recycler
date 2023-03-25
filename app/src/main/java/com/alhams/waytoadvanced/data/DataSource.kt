package com.alhams.waytoadvanced.data

import com.alhams.waytoadvanced.data.domain.Post
import com.alhams.waytoadvanced.data.domain.Story

object DataSource {
    fun getStories(): List<Story> = listOf(
        Story("https://imgs.search.brave.com/54XFBlsyZ-mBxvftdS6FY7UiUK7_EtO6xx7OEWOPAKE/rs:fit:844:225:1/g:ce/aHR0cHM6Ly90c2Uz/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC55/aU1TTWNLYmJRTDky/Z0dvOGtnUzFRSGFF/SyZwaWQ9QXBp"),
        Story("https://imgs.search.brave.com/pX_AELUKBuEFdM6cscXtvA0g_jh1NNL6HK-nSORCU9E/rs:fit:844:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5i/eU5ZWnBNb0dQbUVl/YU9kTDJCZDF3SGFF/SyZwaWQ9QXBp"),
        Story("https://imgs.search.brave.com/G3dhjr_BmhFQ41yymj1YkEAJ9EV9aw7Lf1l3RL6IBhY/rs:fit:751:225:1/g:ce/aHR0cHM6Ly90c2Ux/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5E/SFl6Vm1JVWEydXpt/WTVJZHFGRVdnSGFF/ciZwaWQ9QXBp"),
        Story("https://imgs.search.brave.com/_vHr84-MlUAZt5N8FcbuxdaZAKyZ0wpMfYKl4_kNOh4/rs:fit:860:225:1/g:ce/aHR0cHM6Ly90c2Ux/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC44/Wk43dFVoQm9FTFR0/NkVRQXhqS093SGFF/RiZwaWQ9QXBp"),
        Story("https://imgs.search.brave.com/k3E4ko19S04350YWSi92nJYJyCMpX6IXmo6Btre2kL8/rs:fit:844:225:1/g:ce/aHR0cHM6Ly90c2Uz/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5n/VkgyZ3NyQ09PMERJ/S3hnR21GZEt3SGFF/SyZwaWQ9QXBp"),
        Story("https://imgs.search.brave.com/k3E4ko19S04350YWSi92nJYJyCMpX6IXmo6Btre2kL8/rs:fit:844:225:1/g:ce/aHR0cHM6Ly90c2Uz/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5n/VkgyZ3NyQ09PMERJ/S3hnR21GZEt3SGFF/SyZwaWQ9QXBp")
    )

    fun getPosts(): List<Post> = listOf(
        Post(
            "Mohammed",
            "hello from kotlin",
            "https://imgs.search.brave.com/54XFBlsyZ-mBxvftdS6FY7UiUK7_EtO6xx7OEWOPAKE/rs:fit:844:225:1/g:ce/aHR0cHM6Ly90c2Uz/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC55/aU1TTWNLYmJRTDky/Z0dvOGtnUzFRSGFF/SyZwaWQ9QXBp"
        ),
        Post(
            "Mohammed",
            "hello from kotlin",
            "https://imgs.search.brave.com/pX_AELUKBuEFdM6cscXtvA0g_jh1NNL6HK-nSORCU9E/rs:fit:844:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5i/eU5ZWnBNb0dQbUVl/YU9kTDJCZDF3SGFF/SyZwaWQ9QXBp"
        ),
        Post(
            "Mohammed",
            "hello from kotlin",
            "https://imgs.search.brave.com/G3dhjr_BmhFQ41yymj1YkEAJ9EV9aw7Lf1l3RL6IBhY/rs:fit:751:225:1/g:ce/aHR0cHM6Ly90c2Ux/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5E/SFl6Vm1JVWEydXpt/WTVJZHFGRVdnSGFF/ciZwaWQ9QXBp"
        ),
        Post(
            "Mohammed",
            "hello from kotlin",
            "https://imgs.search.brave.com/_vHr84-MlUAZt5N8FcbuxdaZAKyZ0wpMfYKl4_kNOh4/rs:fit:860:225:1/g:ce/aHR0cHM6Ly90c2Ux/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC44/Wk43dFVoQm9FTFR0/NkVRQXhqS093SGFF/RiZwaWQ9QXBp"
        ),
        Post(
            "Mohammed",
            "hello from kotlin",
            "https://imgs.search.brave.com/k3E4ko19S04350YWSi92nJYJyCMpX6IXmo6Btre2kL8/rs:fit:844:225:1/g:ce/aHR0cHM6Ly90c2Uz/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5n/VkgyZ3NyQ09PMERJ/S3hnR21GZEt3SGFF/SyZwaWQ9QXBp"
        ),
    )


}