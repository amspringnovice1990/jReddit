package com.github.jreddit;

/**
 * This class represents a reddit "thing"
 *
 * @author <a href="http://www.omrlnr.com">Omer Elnour</a>
 * @see <a href="https://github.com/reddit/reddit/wiki/API">Reddit API Reference</a>
 */
public abstract class Thing {
    /**
     * The kind of this thing. (i.e "t2" for users)
     */
    public String kind;

    /**
     * The full name of this thing.
     *
     * @see <a href="https://github.com/reddit/reddit/wiki/API">Reddit API Reference</a>
     */
    public String fullName;
}