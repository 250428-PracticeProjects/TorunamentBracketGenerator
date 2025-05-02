import { Button, Navbar, NavbarBrand, NavbarCollapse, NavbarLink, NavbarToggle } from "flowbite-react";

const Header: React.FC = () => {
    return (
        <>
            <Navbar fluid>
                <NavbarBrand href="/">
                    <img src="https://wallpapers.com/images/hd/tennis-ball-cartoon-illustration-6p45lyosgv2e1inf.jpg" className="mr-3 h-6 sm:h-9" alt="Flowbite React Logo" />
                    <span className="self-center whitespace-nowrap text-xl font-semibold dark:text-white">Tennis Match Records</span>
                </NavbarBrand>
                <NavbarCollapse>     
                    <NavbarLink href="#">Players</NavbarLink>
                    <NavbarLink href="#">Matches</NavbarLink>
                </NavbarCollapse>
            </Navbar>
        </>

    )
}

export default Header