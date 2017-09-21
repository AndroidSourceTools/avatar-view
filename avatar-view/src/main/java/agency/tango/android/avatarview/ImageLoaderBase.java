package agency.tango.android.avatarview;

import android.support.annotation.NonNull;

import agency.tango.android.avatarview.views.AvatarView;

public abstract class ImageLoaderBase implements IImageLoader {

    private String defaultPlaceholderString;

    public ImageLoaderBase() {
        this.defaultPlaceholderString = AvatarPlaceholder.DEFAULT_PLACEHOLDER_STRING;
    }

    public ImageLoaderBase(String defaultPlaceholderString) {
        this.defaultPlaceholderString = defaultPlaceholderString;
    }

    @Override
    public void loadImage(@NonNull AvatarView avatarView, String avatarUrl, String name) {
        loadImage(avatarView, new AvatarPlaceholder(name, avatarView.textSizePercentage(), avatarView.backgroundColor(), defaultPlaceholderString), avatarUrl);
    }

    @Override
    public void loadImage(@NonNull AvatarView avatarView, String avatarUrl, String name, boolean initialsVisible) {
        loadImage(avatarView, new AvatarPlaceholder(name, initialsVisible, avatarView.textSizePercentage(), avatarView.backgroundColor(), defaultPlaceholderString), avatarUrl);
    }
}
