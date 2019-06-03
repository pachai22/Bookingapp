USE [Movie-Booking]
GO

/****** Object:  Table [dbo].[Seatmanagement]    Script Date: 5/31/2019 2:31:20 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Seatmanagement](
	[SeatID] [varchar](10) NOT NULL,
	[TheatreID] [varchar](10) NOT NULL,
	[AN] [varchar](10) NOT NULL,
	[FN] [varchar](10) NOT NULL,
	[MovieID] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[SeatID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[Seatmanagement]  WITH CHECK drop FOREIGN KEY([MovieID])
REFERENCES [dbo].[Movie] ([MovieID])
GO

ALTER TABLE [dbo].[Seatmanagement]  WITH CHECK ADD FOREIGN KEY([TheatreID])
REFERENCES [dbo].[Theatre] ([TheatreID])
GO


