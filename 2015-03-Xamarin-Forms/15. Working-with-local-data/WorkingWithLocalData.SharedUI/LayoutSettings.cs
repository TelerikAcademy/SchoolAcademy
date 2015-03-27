using System;
using Xamarin.Forms;

namespace WorkingWithLocalData.SharedUI
{
    public static class LayoutSettings
    {
        public static string PagePadding
        {
            get
            {
                return Device.OnPlatform<string>(
                    iOS: "20",
                    Android: "20",
                    WinPhone: "20"
                );
            }
        }

        public static Font LargeFont
        {
            get { return Font.SystemFontOfSize(40); }
        }

        public static Font MediumFont
        {
            get { return Font.SystemFontOfSize(20); }
        }

        public static Font SmallFont
        {
            get { return Font.SystemFontOfSize(15); }
        }
    }
}
