package portfolio.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class Portfolio {

    private UUID id;
    private UUID userId;
    private PortfolioType type;
    private Date createdAt;

    private GeneralInfo generalInfo;
    private ProfessionalInfo professionalInfo;
    private ContactInfo contactInfo;
    private LocationInfo locationInfo;
    private List<SocialLink> socialLinks;

    private List<Service> services;
    private List<JobPost> jobPosts;
    
    public enum PortfolioType {
        INDIVIDUAL,
        COMPANY
    }

    // -------------------- General Information --------------------
    public static class GeneralInfo {
        private String name;
        private String shortDescription;
        private String longDescription;
        private String profilePhotoUrl;
        private String coverImageUrl;
        private List<String> spokenLanguages;
        private PortfolioStatus status;

        public enum PortfolioStatus {
            ACTIVE,
            INACTIVE,
            BLOCKED
        }
    }

    // -------------------- Professional Information --------------------
    public static class ProfessionalInfo {
        private int numberOfEmployees;
        private int activeYears;
        private List<PortfolioProjects> projects; // previous projects
        private Award award;
        private Availability availability;

        public enum Availability {
            FULL_TIME,
            FREELANCE,
            PART_TIME
        }

        public static class PortfolioProjects {
            private String title;
            private String description;
            private List<String> imageUrls;
            private Date startAt;
            private Date completedAt;

        }
    }

    public static class ContactInfo {
        private String email;
        private List<String> phoneNumbers;
        private String websiteUrl;
    }

    public static class SocialLink {

        private SocialPlatform platform;
        private String name;
        private String url;
        
        public enum SocialPlatform {
            LINKEDIN,
            X,
            FACEBOOK,
            INSTAGRAM,
            YOUTUBE,
            GITHUB,
            DRIBBBLE,
            BEHANCE,
            WHATSAPP,
            TELEGRAM
        }
    }

  
    public static class LocationInfo {

        private String country;
        private String city;
        private String address;
        private Double latitude;
        private Double longitude;
    }
}

